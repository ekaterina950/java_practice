public class ProcessStrings implements Stringable{
    String s;
    public ProcessStrings(String s) {
        this.s=s;
    }

    @Override
    public int K_char() {
        int k=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)!=' ')
                k++;
        }
        return k;
    }

    @Override
    public String odd_positions() {
        String cur_s = "";
        for (int i = 0; i < s.length(); i+= 2)
            cur_s += s.charAt(i); // возвращает указанный символ из строки
        return cur_s;
    }

    @Override
    public String reverse() {
        String cur_s="";
        for (int i=s.length()-1;i>=0;i--){
            cur_s+=s.charAt(i);
        }
        return cur_s;

    }
}

