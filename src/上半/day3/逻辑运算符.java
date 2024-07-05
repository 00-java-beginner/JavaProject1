package 上半.day3;

public class 逻辑运算符 {
    public static void main(String[] args) {
//        逻辑运算符
//        逻辑与：&   逻辑或：|    逻辑异或：^   逻辑非：！
        //逻辑与：&   有false则是false
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a > b) & (a > c));//false & false
        System.out.println((a < b) & (a > c));//true & false
        System.out.println((a > b) & (a < c));//false & true
        System.out.println((a < b) & (a < c));//true & true

        //逻辑或：|  有true则是true
        System.out.println((a > b) | (a > c));//false | false
        System.out.println((a < b) | (a > c));//true | false
        System.out.println((a > b) | (a < c));//false | true
        System.out.println((a < b) | (a < c));//true | true

        //逻辑异或：^ 相同为false  不同为true
        System.out.println((a > b) ^ (a > c));//false ^ false
        System.out.println((a < b) ^ (a > c));//true ^ false
        System.out.println((a > b) ^ (a < c));//false ^ true
        System.out.println((a < b) ^ (a < c));//true ^ true

        //逻辑非：！  结果和a的结果相反
        System.out.println(!(a > b)); //false

//      短路逻辑运算符
//      短路与：&&   短路或：||
//      短路与：&&   有false则是false
//      作用与&一样，但是有短路效果  逻辑与&无论左边真假右边都要执行
//      短路与&&如果左边为真，右边执行，如果左边为假，右边不执行
        System.out.println((a > b) && (a > c));//false && false
        System.out.println((a < b) && (a > c));//true && false
        System.out.println((a > b) && (a < c));//false && true
        System.out.println((a < b) && (a < c));//true && true

        //短路或：||  有true则是true
//      作用与|一样，但是有短路效果   逻辑或|无论左边真假右边都要执行
//      短路或||如果左边为假，右边执行，如果左边为真，右边不执行|
        System.out.println((a > b) || (a > c));//false || false
        System.out.println((a < b) || (a > c));//true || false
        System.out.println((a > b) || (a < c));//false || true
        System.out.println((a < b) || (a < c));//true || true

    }
}
