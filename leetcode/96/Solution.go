package main

/**
dp

**/
func numTrees(n int) int {
	dp := make([]int, n+1)
	dp[0] = 1
	dp[1] = 1
	for i := 2; i <= n; i++ {
		for j := 0; j <= i-1; j++ {
			dp[i] += dp[j] * dp[i-j-1]
		}
	}
	return dp[n]
}

/**
記憶化遞歸
**/
// func numTrees(n int) int {
// 	memo := make([]int, n+1)
// 	return helper(n, &memo)
// }

// func helper(n int, memo *[]int) int {
// 	if n == 1 || n == 0 {
// 		return 1
// 	}
// 	if (*memo)[n] > 0 {
// 		return (*memo)[n]
// 	}
// 	count := 0
// 	for i := 0; i <= n-1; i++ {
// 		count += helper(i, memo) * helper(n-i-1, memo)
// 	}
// 	(*memo)[n] = count
// 	return count
// }

/**
	以k為根結點的BST樹的種類 = 左子樹BST總數 + 右子樹BST總數
	遞歸
**/
// func numTrees(n int) int {
// 	if n == 1 || n == 0 {
// 		return 1
// 	}
// 	count := 0
// 	for i := 0; i <= n-1; i++ {
// 		count += numTrees(i) * numTrees(n-i-1)
// 	}
// 	return count
// }
