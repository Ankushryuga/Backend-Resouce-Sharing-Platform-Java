package com.ankush.Resource_sharing_app.mapper.FavouriteMapper;

import com.ankush.Resource_sharing_app.dto.FavouriteDTO.FavouriteRequestDTO;
import com.ankush.Resource_sharing_app.dto.FavouriteDTO.FavouriteResponseDTO;
import com.ankush.Resource_sharing_app.model.favourite.Favourite;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;

public class FavouriteMapper {
    private static Favourite toEntity(FavouriteRequestDTO dto){
        Favourite favourite=new Favourite();
        favourite.setUserId(dto.getUserId());
        favourite.setCourseId(dto.getCourseId());

        WorkStreams workStreams=new WorkStreams();
        workStreams.setWorkStreamId(dto.getWorkStreamId());
        favourite.setWorkStreams(workStreams);

        return favourite;
    }

    public static FavouriteResponseDTO toDTO(Favourite favourite){
        FavouriteResponseDTO dto=new FavouriteResponseDTO();
        dto.setFavouriteId(favourite.getFavouriteId());
        dto.setUserId(favourite.getUserId());
        dto.setCourseId(favourite.getCourseId());

        if(favourite.getWorkStreams()!=null){
            dto.setWorkStreamId(favourite.getWorkStreams().getWorkStreamId());
        }
        return dto;
    }

//    update::
    public static void updateEntity(Favourite favourite, FavouriteRequestDTO favouriteRequestDTO){
        favourite.setUserId(favouriteRequestDTO.getUserId());
        favourite.setCourseId(favouriteRequestDTO.getCourseId());
        if(favourite.getWorkStreams()==null){
            favourite.setWorkStreams(new WorkStreams());
        }
        favourite.getWorkStreams().setWorkStreamId(favouriteRequestDTO.getWorkStreamId());
    }
}
