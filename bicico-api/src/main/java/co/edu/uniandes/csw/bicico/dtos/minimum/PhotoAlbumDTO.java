/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.bicico.dtos.minimum;

import co.edu.uniandes.csw.bicico.entities.PhotoAlbumEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @generated
 */
@XmlRootElement
public class PhotoAlbumDTO  implements Serializable{


private org.eclipse.uml2.uml.internal.impl.DataTypeImpl@278bb07e (name: Long, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false id;
private String name;

  

    public PhotoAlbumDTO() {
    }


public PhotoAlbumDTO(PhotoAlbumEntity entity) {
   if (entity!=null){
    this.name=entity.getName();
       }
    }
    


 public PhotoAlbumEntity toEntity() {
        PhotoAlbumEntity entity = new PhotoAlbumEntity();
        entity.setName(this.getName());
         return entity;
       }
       


    
    public  org.eclipse.uml2.uml.internal.impl.DataTypeImpl@278bb07e (name: Long, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false getId() {
        return id;
    }
  
    public void setId( org.eclipse.uml2.uml.internal.impl.DataTypeImpl@278bb07e (name: Long, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false id) {
        this.id = id;
    }

    
    public  org.eclipse.uml2.uml.internal.impl.DataTypeImpl@278bb07e (name: Long, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: falseString getName() {
        return name;
    }
  
    public void setName( org.eclipse.uml2.uml.internal.impl.DataTypeImpl@278bb07e (name: Long, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: falseString name) {
        this.name = name;
    }

}
