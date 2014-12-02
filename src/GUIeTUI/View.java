/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIeTUI;

import java.awt.event.ActionListener;
import java.util.Observer;

interface View extends Observer {

	void start();

	void addController(ActionListener controller);
}