with open('faulty_statements.txt') as ifs:
    lines = ifs.readlines()
    print lines
    new_lines = lines[1:]
    new_lines = map(lambda ele: ele.split(), new_lines)
    with open('faulty_statements.csv', 'w') as ofs:
        ofs.write('Line number,Fault likelihood\n')
        for ele in new_lines:
            ofs.write(ele[6] + ',' + ele[2] + '\n')
