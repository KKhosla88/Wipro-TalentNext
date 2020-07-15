import java.util.ArrayList;
import java.util.HashSet;
public class First_Nonrepeating 
{
	public static char nonRepeating(String word)
	{
		HashSet<Character>repeat=new HashSet<Character>();
		ArrayList<Character>nonrepeat=new ArrayList<Character>();
		for(int i=0;i<word.length();i++)
		{
			char letter=word.charAt(i);
			if(repeat.contains(letter))
				continue;
			if(nonrepeat.contains(letter))
			{
				nonrepeat.remove((Character)letter);
				repeat.add(letter);
			}
			else
			{
				nonrepeat.add(letter);
			}
		}
//		System.out.print("non repeating characters: ");
//		for(int i=0;i<nonrepeat.size();i++)
//			System.out.print(nonrepeat.get(i));
		return nonrepeat.get(0);
		
	}

	public static void main(String[] args) 
	{
		System.out.print("first non repeating character: ");
		System.out.println(nonRepeating("admiral"));
		
	}
	
}

