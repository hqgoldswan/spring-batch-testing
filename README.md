# Employed Spring features:
 - Spring-Batch (1)
 - Async methods (2)
 - Cron scheduler (3)

# How to read
 - Check the annotation in SpringBatchApplication.java
 - Check the sample job in SampleJob.java
   + Check firstJob() setup
     - Make Job Execution Unique: for auto increase job parameter in order to make it unique per execution
       ```
       .incrementer(new RunIdIncrementer())
       ```
     - For using the JobListener interface
     - Checking firstStep() setup:
       + For using StepListener

   + Check secondJob() setup for
     - Configuration: chunk size, input output of chunk
     - ItemReader: used for reading information from any source, number of calls to ItemReader func depend on chunk size configuration.
     - ItemProcessor: number of calls to ItemProcessor func depend on chunk size configuration.
     - ItemWriter: for each chunk, there is one call to ItemWriter, the passed input is equal to chunk size configuration. 
     - Combination between Tasklet step and Chunk oriented step

 - Check JobController:
   + For API based Spring-Batch job controlling
     - By using JobLauncher, the Job parameter must be configured and passed to Job from JobLauncher. 
       + We can't use the Job parameter inside Job building anymore.
     - Passing Job Parameter from api request as json
     - Start/Stop job by JobOperator
   + For Async handling mechanism in Spring Boot (2)

 - Checking SecondJobScheduler.java for using scheduler to run a job (3)

 - Check the application.properties for:
   + Spring batch data source configuration
   + Disable auto run Spring-Batch job in app

 - Check program arguments in run configuration for job parameter setting

# Implementation note:
 - Spring Batch will run all the job in your source code with @Bean annotation, if the default enabled autorun configuration value is true
