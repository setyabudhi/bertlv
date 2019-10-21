package com.payneteasy.tlv;

public class BerTlvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hex = "5F2A0203609F1E0830303132333435369A031907099C01305A0840477600167580019F100706010A03A000009F33036040209F02060000000000009F03060000000000009F3602008B9F370443F3774C9F26085C1EC97AC826C5DE9F2701809F0607A000000003101082021C00950580800480009F1A020360";
		BerTlvs tlvs = parse(hex);
	
		System.out.println(tlvs);
		
		BerTag tag = new BerTag(0x9A);
		BerTlv tag9A = tlvs.find(tag);
		System.out.println(tag9A.getTag().toString());
		System.out.println(tag9A.getHexValue());
	}

    private static BerTlvs parse(String hex) {
        byte[] bytes = HexUtil.parseHex(hex);

        BerTlvParser parser = new BerTlvParser();
        BerTlvs tlvs = parser.parse(bytes, 0, bytes.length);

        return tlvs;
    }
}
