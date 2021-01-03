package com.gildedrose.strategy.util;

public class RealTimeSalesDataCollector {
    private static RealTimeSalesDataCollector instance;
    static {
        //Initialize the instance with real data provider. Maybe some distribute cache or MQ.
        //To make things sample we don't use the "advanced" feature like lazy loading and synchronization.

        //Node node = nodeBuilder().node();
        //Client client = node.client();
        //instance = new RealTimeSalesDataCollector(client);
        instance = new RealTimeSalesDataCollector();
    }

    public static RealTimeSalesDataCollector instance() {
        return instance;
    }

    public SalesData fetchSalesDataOf(String name) {
        //client.prepareSearch("product", name);
        //...
        return new SalesData(1, 20.5);
    }

    public class SalesData {
        private final int count;
        private final double averageQuality;

        public SalesData(int count, double averageQuality) {
            this.count = count;
            this.averageQuality = averageQuality;
        }

        public int getCount() {
            return count;
        }

        public double getAverageQuality() {
            return averageQuality;
        }
    }
}
