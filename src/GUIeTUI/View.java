
package GUIeTUI;

import java.awt.event.ActionListener;
import java.util.Observer;

interface View extends Observer {

	void start();

	void addController(ActionListener controller);
}