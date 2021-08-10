package string;

public class ExtractString {

    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static void main(String[] args) {
        byte[] arr = { (byte) 0xf4, 01, 01, (byte) 0xa3 };
        String res = bytesToHex(arr);
        String res1 = convertByteArrayToHexString(arr);
        System.out.println(res);
        System.out.println(res1);
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static String convertByteArrayToHexString(byte[] bytes) {
        StringBuilder buffer = new StringBuilder("");

        for (int i = 0; i < bytes.length; i++) {
            if (Integer.toHexString(bytes[i] & 0xFF).length() == 1) {
                buffer.append("0");
            }
            buffer.append(Integer.toHexString(bytes[i] & 0xFF) + ",");
        }
        return buffer.toString();
    }
}
