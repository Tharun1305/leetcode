var addTwoPromises = async function(promise1, promise2) {
    return Promise.all([promise1,promise2]).then(value => value.reduce((acc,val) => acc+val,0))
};