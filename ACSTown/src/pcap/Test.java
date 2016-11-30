package pcap;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.PcapNetworkInterface.PromiscuousMode;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.NifSelector;

public class Test {
	
	public static void main(String[] args){
		InetAddress addr;
		try {
			addr = InetAddress.getByName("192.168.10.100");
			PcapNetworkInterface nif = new NifSelector().selectNetworkInterface();
			System.out.println(nif);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
