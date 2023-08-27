import java.io.DataOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // prepare for emulator
        ProcessRunner emulator = new ProcessRunner("./dump_memory.sh Android-11-hehe");
        emulator.waitFor();

        /*
        * Tạo file khởi động emulator, tạo file để check xem emulator đã
        * khởi động hay chưa (chia cái while trong file cũ ra)
        * Chạy 2 file, đợi thằng check làm xong
        * Tạo stdin -> gửi qemu script vào emulator.
         */

        DataOutputStream stdin = new DataOutputStream(emulator.process.getOutputStream());

        // script for shutdown emulator
        /*
        ProcessRunner shutdown = new ProcessRunner("adb -s emulator-5554 emu kill");
        shutdown.waitFor();
        */
    }
}