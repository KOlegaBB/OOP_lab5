package ua.edu.ucu.apps.demo.Flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private
    List<FlowerBucket> buckets = new ArrayList<>();

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public FlowerBucket search(FlowerBucket search_bucket) {
        for (FlowerBucket bucket : buckets) {
            if (bucket.equals(search_bucket)) {
                return bucket;
            }
        }
        return null;
    }
}
