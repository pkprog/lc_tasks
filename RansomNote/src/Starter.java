public class Starter {

    public static void runCheck(String target, String source) {
        System.out.println("*****");
        System.out.println("text1=" + target + " -> " + "text2=" + source);
        System.out.println("result=" + new Solution().canConstruct(target, source));
    }

    public static void main(String[] props) {
        runCheck("a", "b");
        runCheck("aa", "aab");
        runCheck("aa", "ab");
        runCheck("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");
    }

}
