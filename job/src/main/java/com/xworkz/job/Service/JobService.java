package com.xworkz.job.Service;

import com.xworkz.job.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    boolean saveAndValid(JobDTO jobDTO);
}
