package mvc.models;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class Model {
		static String checkHead = "ABCDEFGHJKLMNPQRSTUVWXYZIO";
    	public boolean verifyID(JFormattedTextField input) {
			String id=input.getText();
			Boolean result =false;
			String v[]= {"A", "B", "C", "D","E","F","G", "H", "J", "K","L","M", "N", "P", "Q", "R","S", "T", "U","V", "X", "Y", "W","Z", "I", "O"};

			int inte = -1;
			String s1 = String.valueOf(Character.toUpperCase(id.charAt(0)));
			for(int i = 0; i < 26; i++){
				if(s1.compareTo(v[i]) == 0){
					inte = i;
					break;
				}
			}

			int total = 0;
			int all[] = new int[11];
			String E = String.valueOf(inte + 10);
			int E1 = Integer.parseInt(String.valueOf(E.charAt(0)));
			int E2 = Integer.parseInt(String.valueOf(E.charAt(1)));
			all[0] = E1;
			all[1] = E2;

			for(int j = 2; j <= 10; j++)
				all[j] = Integer.parseInt(String.valueOf(id.charAt(j - 1)));
			for(int k = 1; k <= 9; k++)
				total += all[k] * (10 - k);
			
			total += all[0] + all[10];


			if(total % 10 == 0)
				result = true;    //驗証成功
			else
				result = false;    //驗証失敗

			return result;
		}

        public String makeID() {
            Random r = new Random();
			String s = "";
			int checknum = 0;	// 產生前9碼的同時計算產生驗證碼

			// 產生第一個英文字母
			int t=(r.nextInt(26)+65);
			s+=(char)t;
			t=checkHead.indexOf((char)t)+10;
			checknum += t/10;
			checknum += t%10*9;

			// 產生第2個數字 (1~2)
			s += Integer.toString(t = r.nextInt(2)+1);
			checknum += t*8;

			// 產生後8碼
			for (int i=2; i<9; i++){
				s += Integer.toString(t = r.nextInt(10));
				checknum += t*(9-i);
			}
			
			// 完成驗證碼計算
			checknum = (10-((checknum)%10))%10;
			s+=Integer.toString(checknum);
			return s;
        }

}