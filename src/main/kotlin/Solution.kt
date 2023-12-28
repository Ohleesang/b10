/**
 * 3의 배수랑 3숫자를 사용하지 않음
 * 1	1	6	8
 * 2	2	7	10
 * 3	4	8	11
 * 4	5	9	14
 * 5	7	10	16
 */
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = mutableListOf<Int>()
        var temp =""
        var is3num = false
        for(i in 1..200)
        {
            temp = i.toString()
            is3num = temp.contains('3')
            var isTrue = !((i%3==0) || is3num)
            if(isTrue) num.add(i)
        }
        answer = num.get(n-1)
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(15)//25
    a.solution(40)//76
}