import Item from "./Item";

const List = ({ listData, deleteData }) => {
  return (
    <di className="list">
      {listData.map((item) => {
        const { note, date, time, id } = item;
        return (
          <Item
            key={id}
            id={id}
            noteData={note}
            dateData={date}
            timeData={time}
            deleteData={deleteData}
          />
        );
      })}
    </di>
  );
};

export default List;
