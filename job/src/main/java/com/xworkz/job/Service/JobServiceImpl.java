package com.xworkz.job.Service;

import com.xworkz.job.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    @Override
    public boolean saveAndValid(JobDTO jobDTO) {
        return true;
    }
}
