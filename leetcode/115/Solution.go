package algo

/**
dp

**/
func numDistinct(s string, t string) int {
	sLen, tLen := len(s), len(t)

	dp := make([][]int, sLen+1)
	for i := range dp {
		dp[i] = make([]int, tLen+1)
	}

	for i := 0; i < sLen+1; i++ {
		for j := 0; j < tLen+1; j++ {
			if j == 0 {
				dp[i][j] = 1
			} else if i == 0 {
				dp[i][j] = 0
			} else {
				if s[i-1] == t[j-1] {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
				} else {
					dp[i][j] = dp[i-1][j]
				}
			}
		}
	}
	return dp[sLen][tLen]
}

/**
記憶化搜索
**/
// func numDistinct(s string, t string) int {
// 	sLen, tLen := len(s), len(t)

// 	memo := make([][]int, sLen)
// 	for i := range memo {
// 		memo[i] = make([]int, tLen)
// 		for j := 0; j < tLen; j++ {
// 			memo[i][j] = -1
// 		}
// 	}
// 	var helper func(i, j int) int
// 	helper = func(i, j int) int {
// 		if j < 0 {
// 			return 1
// 		}
// 		if i < 0 {
// 			return 0
// 		}
// 		if memo[i][j] != -1 {
// 			return memo[i][j]
// 		}
// 		if s[i] == t[j] {
// 			memo[i][j] = helper(i-1, j) + helper(i-1, j-1)
// 		} else {
// 			memo[i][j] = helper(i-1, j) //
// 		}
// 		return memo[i][j]
// 	}

// 	return helper(sLen-1, tLen-1)
// }

/**
暴力遞歸

**/
// func numDistinct(s string, t string) int {
// 	sLen, tLen := len(s), len(t)

// 	var helper func(i, j int) int
// 	helper = func(i, j int) int {
// 		if j < 0 { // base case
// 			return 1
// 		}
// 		if i < 0 { // 这两个base case 的顺序不能调换！因为 i<0 且 j<0 时 应该返回1
// 			return 0
// 		}
// 		if s[i] == t[j] {
// 			return helper(i-1, j) + helper(i-1, j-1)
// 		} else {
// 			return helper(i-1, j)
// 		}
// 	}
// 	return helper(sLen-1, tLen-1)
// }
