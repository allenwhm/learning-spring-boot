package com.allenwhm;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.nio.file.Paths;

/**
 * Created by : allenwhm
 * DateTime : 2019-04-15 11:53
 **/
public class Application {
    public static void main(String[] args) {

        // list the bucket
        Region region = Region.US_EAST_2;
        S3Client s3 = S3Client.builder().region(region).build();
        ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
        ListBucketsResponse listBucketsResponse = s3.listBuckets(listBucketsRequest);
        listBucketsResponse.buckets().stream().forEach(x -> System.out.println(x.name()));

        String bucket = "bucket" + System.currentTimeMillis();
        CreateBucketRequest createBucketRequest = CreateBucketRequest
                .builder()
                .bucket(bucket)
                .createBucketConfiguration(CreateBucketConfiguration.builder()
                        .locationConstraint(region.id())
                        .build())
                .build();
        s3.createBucket(createBucketRequest);

        String key = "dummy/test.txt";
        s3.putObject(PutObjectRequest.builder().bucket(bucket).key(key).build(), Paths.get("C:\\Users\\MI\\Desktop\\test.txt"));

//        s3.deleteObject(DeleteObjectRequest.builder().bucket(bucket).key(key).build());
//        s3.deleteBucket(DeleteBucketRequest.builder().bucket(bucket).build());
    }
}
