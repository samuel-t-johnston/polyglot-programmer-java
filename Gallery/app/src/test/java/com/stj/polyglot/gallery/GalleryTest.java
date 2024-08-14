package com.stj.polyglot.gallery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GalleryTest {
    
    @Test 
    void testGallery_hasInfo() {
        Gallery classUnderTest = new Gallery();
        assertNotNull(classUnderTest.getInfo(), "App should have info");
    }

    // @Test 
    // void testGallery_fail() {
    //     Gallery classUnderTest = new Gallery();
    //     assertNull("Not null", "This test should fail");
    // }
}
