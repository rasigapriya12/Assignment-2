class Download extends Thread {
    private String part;

    Download(String part) {
        this.part = part;
    }

    public void run() {
        try {
            System.out.println(part + " downloading...");
            Thread.sleep(1000);
            System.out.println(part + " completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {
        Download d1 = new Download("Part 1");
        Download d2 = new Download("Part 2");

        d1.start();
        d1.join();   // wait for first part to finish
        d2.start();
        d2.join();

        System.out.println("File download completed.");
    }
}
