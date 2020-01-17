//Ibrahim Mohamed

package findminandmaxibrahimmohamed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class FindMinAndMaxIbrahimMohamed
{

    public static void main(String[] args)
    {
        int num, option = 0;
        List<Integer> nums = new ArrayList<>();

        while (option == 0)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter "
                    + "a number."));

            nums.add(num);

            option = JOptionPane.showConfirmDialog(null, "Would you like to "
                    + "enter another number?");
        }

        Collections.sort(nums);

        JOptionPane.showMessageDialog(null, "Smallest: " + nums.get(0)
                + "\nLargest: " + nums.get(nums.size() - 1));
    }
}
