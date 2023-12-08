package com.example.test.common

import com.example.test.utils.log

fun main() {

    val numbers = intArrayOf(1, 2, 3)

    // 使用展开运算符将数组元素作为参数传递给函数
    fun sum(vararg numbers: Int): Int {
        return numbers.sum()
    }

    val result = sum(*numbers) // 等同于 sum(1, 2, 3)

    log(result) // 输出：6

    val moreNumbers = intArrayOf(*numbers, 4, 5)

    log(moreNumbers.contentToString()) // 输出：[1, 2, 3, 4, 5]
}
