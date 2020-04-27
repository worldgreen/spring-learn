package com.study.dao;

import com.study.model.T1;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRowMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        T1 t1 = new T1();
        t1.setId(rs.getInt("id"));
        t1.setName(rs.getString("name"));
        return t1;
    }
    public int[] smallestSufficientTeam(String[] reqs, List<List<String>> people) {
        int n = reqs.length, t = (1 << n) - 1;
        int[] skills = new int[people.size()];
        for (int i = 0; i < people.size(); i++) {
            int mask = 0;
            for (String str : people.get(i)) {
                mask |= (1 << find(reqs, str));
            }
        }
        int[] dp = new int[1 << n];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;
        int[][] pt = new int[1 << n][2];
        for (int i = 0; i < people.size(); i++) {
            int k = skills[i];
            if (k == 0) continue;
            for (int j = t; j >= 0; j--) {
                if (dp[j] + 1 < dp[j | k]) {
                    dp[j | k] = dp[j] + 1;
                    pt[j | k] = new int[]{j, i};
                }
            }
        }
        int tt = t;
        List<Integer> res = new ArrayList<Integer>();
        while (tt > 0) {
            res.add(pt[tt][1]);
            tt = pt[tt][0];
        }
        int[] re = new int[res.size()];
        for (int i = 0; i < re.length; i++) {
            re[i] = res.get(i);
        }
        return re;
    }

    private int find(String[] reqs, String str) {
        for (int i = 0; i < reqs.length; i++) {
            if (str.equals(reqs[i])) return i + 1;
        }
        return 0;
    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
