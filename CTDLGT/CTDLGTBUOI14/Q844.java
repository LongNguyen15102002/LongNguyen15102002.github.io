package CTDLGTBUOI14;

public class Q844 {
    public boolean backspaceCompare(String s, String t) {
        int s_Pointer = s.length() - 1;
        int t_Pointer = t.length() - 1;

        int s_Skip = 0;
        int t_Skip = 0;

        while(s_Pointer >= 0 || t_Pointer >= 0){
            while(s_Pointer >= 0){
                if(s.charAt(s_Pointer) == '#'){
                    s_Skip += 1;
                    s_Pointer -= 1;
                } else if(s_Skip > 0){
                    s_Pointer -= 1;
                    s_Skip -= 1;
                } else {
                    break;
                }
            }

            while(t_Pointer >= 0){
                if(t.charAt(t_Pointer) == '#'){
                    t_Skip += 1;
                    t_Pointer -= 1;
                } else if(t_Skip > 0){
                    t_Pointer -= 1;
                    t_Skip -= 1;
                } else {
                    break;
                }
            }

            if(s_Pointer >= 0 && t_Pointer >= 0 && s.charAt(s_Pointer) != t.charAt(t_Pointer)){
                return false;
            }

            if((s_Pointer >= 0) != (t_Pointer >= 0)) {
                return false;
            }
            s_Pointer -= 1;
            t_Pointer -= 1;
        }
        return true;
    }
}
