package com.input;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.script.ScriptException;

public class EncryptTools {
    /**
     * 加密
     *
     * @param content
     *            需要加密的内容
     * @param password
     *            加密密码
     * @return
     */
    public static byte[] encrypt(String content, String password) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            String os = System.getProperty("os.name");
            if(os.toLowerCase().startsWith("win")){
                kgen.init(128, new SecureRandom(password.getBytes()));
            }else{
                SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
                secureRandom.setSeed(password.getBytes());
                kgen.init(128, secureRandom);
            }
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param content
     *            待解密内容
     * @param password
     *            解密密钥
     * @return
     */
    public static byte[] decrypt(byte[] content, String password) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            String os = System.getProperty("os.name");
            if(os.toLowerCase().startsWith("win")){
                kgen.init(128, new SecureRandom(password.getBytes()));
            }else{
                SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
                secureRandom.setSeed(password.getBytes());
                kgen.init(128, secureRandom);
            }

            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(content);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将二进制转换成16进制
     *
     * @param buf
     * @return
     */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1) {
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    public static void main(String[] args) throws ScriptException {
        String content = "哈哈哈【富力】";
        String password = "Pk1vPrDUXY1lRBPwYfM0";
        //加密
        System.out.println("加密前：" + content);

        String encryptResultStr = parseByte2HexStr(encrypt(content, password));
        System.out.println("加密后：" + encryptResultStr);
        String string="EEB62CBC1BB02AE67C071A458DE51AA31A357C63D7CBD37C49C5FB92247AA495D055BA8D6018860D40001892BE1377A7076B3D3E50105048B7EE0E2910BD07CD9326DC4028AFBA1B66DBA05E865FE4689FDAAE64BEEA8996EBA489CCE77527D5196E3E1E6495DB452B37A23C7F69E11DA384C2738E80BBA2E6878993CBBBBB29A47E8014B45573644F41B7C3D9568EADCF056125DEE625B9DB290CA52A1F15BD0D83F2A2B0DF51A9E57C1076C32C7AC99755EC420B51A6D39EE7C7B07DDBA06EFEABEBB1BF77ABCDFBFF3DD4CDDA11D9D373FFB0CB0D0D6E738EFBEB497A3E448EA93C1BBFF2ABA23278EE1B793AEA6360628783B51BCC1FE98CE44538916442BBE49388271D9DE1FBD52185C154FE50B62478680CFBA3DEED3BB5EBE75B2AAA0BB2E1A552D653B75B5E6DE4F8D04B4B4F89E116A83C6304A06B8C68E7079FD97F64ED6AEFA79BA482EE9B3BE284AF928168C92CAB176303D98C6B82710362666AB7ED56F92906AA42ABD097894CC235277E500715C82767B68A718065F202389CCB8068E90CAC491EDE00A9CE562A7AF35F6D30ABC96CCD72119438E0B9F9134E81A64C6E76F96EC2D01CFD6CD692EC2637CAE72413CF92D9DA2A8935238A55922CF8C990F33684891E89BAB3976DA2AF05BCB8BD9F4C7D067072BBDAD40973462DEEC0669DDEC3F27C8286D340F76F7C25EAAADB2BB9F14FBEC347885B54D29EF002856D039CF65EB648E8D0A1CE45F7F56A3866E1801110EF38794D2B6E30790F8A943C41EF214B2BBA9574B7EA4BC1015D837D06BC2298E7C000A2295343C8F9CE1638B139E3E55D3F430249DBE1EBEE1FF01E06F6B2FD0906245104BACA28237598F7BE83FBEABA959AB0769ED61F0B20D9D410A8B89EA96FA4B53102D561C9C584EAC0E22E40D5ECDF2343798FCF52F8B101914EC63073341FFCDB4ECC2C2F06F6D8E55105C35326D0CCB484F206CD4808ED77B27BEEBF7F5EAA7AE7B11CC060CC805C099037CDA71F2CD1E16C8FD4A0AADCBE35329C57CFA7C39BAF0046F120682C1AB5966B074D1622F7B281EC9FD57C62628C980EBC88803B4546667A3DA7572BE17B14A561731E5B0EB647AB1958F466EFDA3461B8C82C66BAA872F07E660DBD7C7B9A9BF37FFC88517F7BBA2C3D30DE053D8447E3C3517043AB2A12325CEEF1A5BC541C1CED611F61E169F670415E8B23F6A9471D4194A52ECDFEAB576C88EEF2C399DCE1F98A3F18DB952BA5A65940F0BE7064FC1D7F58214D0A489CA0BF690948367225C0897E0BB5269FC3377037376E2764C1F3254C9EF8D980F6A07967508E2C43D1E2ED7CE22C6FEA8C1E77E634B8749728CAE1C495E89B2B0036D7DCEE986C6CF76FA21C4878C4014F16C21F29761717843543827A87B317B5C2FD5E48641DF91A529A93A2814A8994317AB91E80E4ED9C834BC25237D3BDCB48716C2E219DC6A8A094DCA4DB2C57FA8D5FDC7522824605D3B1F740C1DD067B2D3B1840EFFC1B7F616919A7CAFA2D1C3BA78C33EFE7ABAB1E88DEBCE5FE7E28ED0CDA6CC6AF368A8CAB4746B8B1E3F1CDF36C667069C7A750C53833A6F2432CC6D13A446D99CE5ED6AB39BD2397CB9F59EDB406AAB4F9D5BED76BDA4D8FFBEAEA136C2969039C63E522832F90759DAAF384C8825317E02655F3314F5B4767E6E14D4A041A26254EF47B46C08292CABA9B9D088D0373BADE4EF82C8E32ECE8A5967EBFC3B3BAA4C35FBA526345CF41E85B78FE49429F738D14138A606AF23E781ECEC6C9E906796988EE44D46FDED76B22E8872F32DB6CAA4505E2E7A4317FB858272A17FAE9182B086839F5F89A2CAFE6419AD343B7EE438F3E0068240CF2C2CA42BD43E86AE7A33A370F069A7D77385D97CCEAF0D4727FB579C6F1AE023E4244085A1826B08DB800A365EE52271C307FF75FE3940664D1E02A61E30028428E59DE2F98D524AF88A48147929462E2C9D09DBBD472DAFD9E2F4960CA250F6AC8FF329EA1001E755B1DC2C8AD07E16CDF5CF5D83761234EEA29CB371C48735007372F515F8C9E3DBDB6987E71C7A18BA8FB206CD73F1496B0223946DF69A9A8A5797AA1FDBE33817D9DBEB35343AA8E75AD285E804BFB02CDD240B1A446EA1FC978A2E491E4F764E9980EB7217B1A1812B11AF5D5875C0FBF516917BD1A20B228BEEB21FE6F087095F5D76CA35C54A429B9715209856032CE37E16760E1030FD3E6172F1DDA591F64D45C559DA6E892A7BD04B8390D8C93D2F288A2F48952103001C8DBF9CC1F400EC4CF34F327A1D92594478FE56CBC54EADF24EA79AD1D4988698C6204233048B08FE4E838FF5C";
        byte[] decryptResult = decrypt(parseHexStr2Byte(string),password);
        System.out.println("解密后：" + new String(decryptResult));
    }
}
