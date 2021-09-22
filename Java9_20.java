public class Java9_20 {
    private String actualMemorySize(String storage){
        String units = storage.substring(storage.length()-2);
        double size = Double.parseDouble(storage.substring(0, storage.length()-2));
        size -= size * 0.07;
        String actualMemory = "";
        if(units.equals("GB") && size < 1){
            size = round(size*1000, 0);
            String decimalMB = String.valueOf(size);
            actualMemory = decimalMB.substring(0, decimalMB.length()-2)+"MB";
        }else if(units.equals("GB")){
            size = round(size, 2);
            actualMemory = String.valueOf(size)+units;
        }else if(units.equals("MB")){
            size = round(size, 0);
            String decimalMB = String.valueOf(size);
            actualMemory = decimalMB.substring(0, decimalMB.length()-2)+units;
        }

        return actualMemory;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String args[]){
        Java9_20 object = new Java9_20();
        System.out.println(object.actualMemorySize("32GB"));
        System.out.println(object.actualMemorySize("2GB"));
        System.out.println(object.actualMemorySize("512MB"));
        System.out.println(object.actualMemorySize("1GB"));
    }
}
