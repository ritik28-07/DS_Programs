import java.util.Stack;
public class EvaluationOfPrefix 
{
	public static Double evaluate(double a, double b, char operator)
	{
        switch (operator) 
        {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0.0;
    }
    public static Double convert(String expression) 
    {

        StringBuilder input = new StringBuilder(expression);
        input.reverse();

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);

            if(c==' ')
                continue;

            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') 
            {
                double s1 = stack.pop();
                double s2 = stack.pop();
                double temp = evaluate(s2, s1, c);
                stack.push(temp);
            } 
            else 
            {
                
                StringBuffer temp = new StringBuffer();
                while(Character.isDigit(c)) 
                {
                    temp.append(c);
                    i++;
                    c = input.charAt(i);
                }
                i--;
                double num = Double.parseDouble(temp.reverse().toString());
                stack.push(num);
            }
        }
        double result = stack.pop();
        return result;
    }

    public static void main(String[] args) 
    {
        String exp = "- / * 2 * 5 + 3 6 5 2";
        System.out.println("Prefix Expression: " + exp);
        System.out.println("Evaluation: " + convert(exp));
    }
}
