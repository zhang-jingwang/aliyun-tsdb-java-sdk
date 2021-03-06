package com.aliyun.hitsdb.client;

import com.aliyun.hitsdb.client.exception.http.HttpClientInitException;

/**
 * @since 0.2.1
 * @deprecated use {@link TSDBClientFactory} instead.
 */
@Deprecated
public class HiTSDBClientFactory {
    public static HiTSDB connect(String host, int port) throws HttpClientInitException {
        HiTSDBConfig config = HiTSDBConfig.address(host, port).config();
        HiTSDB client = new HiTSDBClient(config);
        return client;
    }

    public static HiTSDB connect(HiTSDBConfig config) throws HttpClientInitException {
        HiTSDB client = new HiTSDBClient(config);
        return client;
    }

}
