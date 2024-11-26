package learn_frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowlistener implements WindowListener {
    //add window listener
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closing");
            System.exit(0); // Close the application
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("Window closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window minimized");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Window restored");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Window activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window deactivated");
        }
}

