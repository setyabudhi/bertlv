package com.payneteasy.tlv;



public class BerTlvParserTest {

    public static final BerTag TAG_DF0D_ID = new BerTag(0xdf, 0x0d);
    public static final BerTag TAG_DF7F_VERSION = new BerTag(0xdf, 0x7f);

    public static final BerTag T_EF = new BerTag(0xEF);



    private BerTlvs parse(String hex) {
        byte[] bytes = HexUtil.parseHex(hex);

        BerTlvParser parser = new BerTlvParser();
        BerTlvs tlvs = parser.parse(bytes, 0, bytes.length);
        BerTlvLogger.log("    ", tlvs, LOG);
        return tlvs;
    }


}
