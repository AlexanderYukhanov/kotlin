// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = 10..5
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 10..5: $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = 10.toByte()..(-5).toByte()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for 10.toByte()..(-5).toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = 10.toShort()..(-5).toShort()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for 10.toShort()..(-5).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = 10L..-5L
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for 10L..-5L: $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = 'z'..'a'
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for 'z'..'a': $list5"
    }

    return "OK"
}
