package com.arunditti.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by arunditti on 2/12/18.
 */

public final class PetContract {

    // To prevent someone from accidently instantiating the contract class, give it an empty constructor
    private PetContract() {

    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class PetEntry implements BaseColumns {
        //Name of database table for pets
        public final static String TABLE_NAME = "pets";

        //Unique ID for the pet. TYPE INTEGER
        public final static String _ID = BaseColumns._ID;

        //Name of the pet. TYPE TEXT
        public final static String COLUMN_PET_NAME = "name";

        //Breed of the pet. TYPE TEXT
        public final static String COLUMN_PET_BREED = "breed";

        // Gender of the pet. TYPE INTEGER
        public final static String COLUMN_PET_GENDER = "gender";

       //Weight of the pet. TYPE INTEGER
        public final static String COLUMN_PET_WEIGHT = "weight";

        //Possible values of the Gender of the pet
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
