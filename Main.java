import java.util.Scanner;

public class Main {

    public static void showChannels(Remote remote)
    {
        if (remote.numberofChannels() == 0)
        {
            System.out.println("No channels currently available...");
        }
        else
        {
            for (String channel : remote)
            {
                System.out.println("Channel : " + channel);
            }
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Welcome to the Control Program...");
        Scanner scanner = new Scanner(System.in);

        String transactions = "Transactions...\n"
                +"1- Show the channels \n"
                +"2- Add Channel \n"
                +"3- Remove Channel \n"
                +"4- Find out the number of channels \n"
                +" Press q to exit...";

        Remote remote = new Remote();

        while (true)
        {
            System.out.println(transactions);
            System.out.println("Enter your transaction : ");
            String entrance = scanner.nextLine();

            if (entrance.equals("q"))
            {
                System.out.println("Exiting the program...");
                break;
            }
            else if (entrance.equals("1"))
            {
                showChannels(remote);
            }
            else if (entrance.equals("2"))
            {
                System.out.print("Enter the Channel to be added  : ");
                String channel_name = scanner.nextLine();
                remote.addChannel(channel_name);
            }
            else if (entrance.equals("3"))
            {
                System.out.println("Channel to be deleted : ");
                String channel_name = scanner.nextLine();

                remote.removeChannel(channel_name);
                System.out.println(channel_name + " Deleted..." );
            }
            else if (entrance.equals("4"))
            {
                System.out.println("Number of channels : " + remote.numberofChannels());
            }
            else
            {
                System.out.println("invalid transaction ...");
            }

        }
    }
}
