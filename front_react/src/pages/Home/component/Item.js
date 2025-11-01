const Item = ({ id, noteData, dateData, timeData, deleteData }) => {
  function deleteItem() {
    deleteData(function (prev) {
      return prev.filter((item) => item.id !== id);
    });
  }

  return (
    <di className="item">
      <div>
        <p>{noteData}</p>
        <p>{`${dateData} ${timeData}`}</p>
      </div>
      <button className="remove" onClick={deleteItem}>
        Delete
      </button>
    </di>
  );
};

export default Item;
