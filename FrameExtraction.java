import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class VideoCap {
public static void main (String args[]){
System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

VideoCapture cap = new VideoCapture(0);

    //String input = "> Ex. /Users/Android/Desktop/Video/Input.mp4";
    String output = "> Ex. /Users/Android/Desktop/Video/Output";
t = System.out.println(java.time.LocalTime.now());  
// cap.open(input);
int frame_number= 0;
Mat frame = new Mat();

if (cap.isOpened())
{
    long t = System.currentTimeMillis();
    long g = 10000; //10s in milliseconds
    while(System.currentTimeMillis()< (t+g)){
        while(cap.read(frame)) //the last frame of the movie will be invalid.
        {
            if(frame_number%20 == 0){
                Imgcodecs.imwrite(output + "/" + frame_number +".jpg", frame);}
            frame_number++;
        }
        cap.release();
    }
    cap.release();
}
//not sure what we should do if it gives an error
    else{
        System.out.println("Error");
    }
} 
}

