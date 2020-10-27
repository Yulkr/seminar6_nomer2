package Seminar6_nomer2;
interface OnStringBuilderListener{
    void Change(OvservableStringBuilder stringBuilder);
}
class OvservableStringBuilder {

    private OnStringBuilderListener onChange;
    private StringBuilder stringBuilder;

    public void setOnChange(OnStringBuilderListener onChange) {
        this.onChange = onChange;
    }

    public OvservableStringBuilder(){
        stringBuilder = new StringBuilder();

    }
    public OvservableStringBuilder append(Object i){
        stringBuilder.append(i);
        return this;
    }
    public OvservableStringBuilder replace(int start, int end, String str){
        stringBuilder.replace(start, end, str);
        return this;
    }
    public OvservableStringBuilder insert(int index, char[] str, int offset, int len){
        stringBuilder.insert(index, str, offset, len);
        return this;

    }
    public  OvservableStringBuilder delete(int start, int stop){
        stringBuilder.delete(start, stop);
        return this;
    }
    public String toString(){
        return stringBuilder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        OvservableStringBuilder UndoableStringBuilder = new OvservableStringBuilder();
        UndoableStringBuilder.append(111);
        UndoableStringBuilder.setOnChange(new Listen);
    }
}
class Listen implements OnStringBuilderListener{
    public void OnChange(OvservableStringBuilder onChange) {
        System.out.println("" + StringBuilder.toString());

    }
}