package ru.nosov;

import java.util.List;
import javax.annotation.Nullable;


public class WikiResponse {
    private List<WikiDTO> data;

    @Nullable
    public List<WikiDTO> getData() {
        return data;
    }
}
