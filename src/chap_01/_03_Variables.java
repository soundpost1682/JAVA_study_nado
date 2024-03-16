package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "eva";
        int hour = 15;
        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + " delivery will arrive at " + hour);
        System.out.println(name + " 평균점수는 " + score + " 점입니다.");
        System.out.println("학점은 " + grade + " 이다.");

        boolean pass = false;
        System.out.println("합격했냐? " + pass);

        double d = 3.1412345678;
        float f = 3.1442354346F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);


    }

}
