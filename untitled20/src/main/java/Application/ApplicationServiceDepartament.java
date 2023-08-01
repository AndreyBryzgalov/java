package Application;

import Domen.Deportament;

public interface ApplicationServiceDepartament extends ApplicationService{
    Deportament CreateEntities(Deportament dep);
    Deportament UpdateEntities(long id,Deportament dep);
}
