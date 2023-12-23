import java.util.ArrayList;
import java.util.Iterator;

// To use the for each method, we implement the iterable interface
public class Remote implements Iterable<String> {
    private ArrayList<String> channels = new ArrayList<String>();

    // Creating Iterators
    public class RemoteIterator implements Iterator<String>
    {
        /*
        If we are implementing an iterator,
        we have to override the hasnext and next methods.
         */

        private int index = 0;

        @Override
        public boolean hasNext() {

            if (index >= channels.size())
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }
    public void addChannel(String channel)
    {
        channels.add(channel);
    }
    public void removeChannel(String channel)
    {
        if (channels.contains(channel))
        {
            channels.remove(channel);
        }
        else
        {
            System.out.println("There is no such channel...");
        }
    }
    public int numberofChannels()
    {
        return channels.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new RemoteIterator();
    }
}
