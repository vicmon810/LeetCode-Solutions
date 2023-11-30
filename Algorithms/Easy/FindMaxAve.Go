package main

import (
	"fmt"
	"math"
)

func findMaxAverage(nums []int, k int) float64 {
	var result, numerator float64 = -797693134862315708145274237, 0
	var length = 0
	divider := float64(k)

	for i := 0; i < len(nums); i++ {
		numerator += float64(nums[i])
		if i < k-1 {
			continue
		}
		for (i-length)+1 > k {
			numerator -= float64(nums[length])
			length++
		}
		result = math.Max(result, numerator/divider)
	}
	return result
}

func main() {
	nums := []int{1, 12, -5, -6, 50, 3}
	k := 4

	maxAverage := findMaxAverage(nums, k)
	fmt.Printf("Maximum average of %d consecutive elements: %.2f\n", k, maxAverage)
}
