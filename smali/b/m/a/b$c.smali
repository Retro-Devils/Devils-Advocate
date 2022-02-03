.class Lb/m/a/b$c;
.super Landroidx/lifecycle/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/m/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final c:Landroidx/lifecycle/q$a;


# instance fields
.field private d:Lb/d/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/d/j<",
            "Lb/m/a/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/m/a/b$c$a;

    invoke-direct {v0}, Lb/m/a/b$c$a;-><init>()V

    sput-object v0, Lb/m/a/b$c;->c:Landroidx/lifecycle/q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/p;-><init>()V

    new-instance v0, Lb/d/j;

    invoke-direct {v0}, Lb/d/j;-><init>()V

    iput-object v0, p0, Lb/m/a/b$c;->d:Lb/d/j;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/m/a/b$c;->e:Z

    return-void
.end method

.method static e(Landroidx/lifecycle/r;)Lb/m/a/b$c;
    .locals 2

    new-instance v0, Landroidx/lifecycle/q;

    sget-object v1, Lb/m/a/b$c;->c:Landroidx/lifecycle/q$a;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/q;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$a;)V

    const-class p0, Lb/m/a/b$c;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->a(Ljava/lang/Class;)Landroidx/lifecycle/p;

    move-result-object p0

    check-cast p0, Lb/m/a/b$c;

    return-object p0
.end method


# virtual methods
.method protected c()V
    .locals 4

    invoke-super {p0}, Landroidx/lifecycle/p;->c()V

    iget-object v0, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v0}, Lb/d/j;->l()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v2, v1}, Lb/d/j;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/m/a/b$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lb/m/a/b$a;->i(Z)Lb/m/b/a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v0}, Lb/d/j;->b()V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v0}, Lb/d/j;->l()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v2}, Lb/d/j;->l()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v2, v1}, Lb/d/j;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/m/a/b$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v3, v1}, Lb/d/j;->i(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lb/m/a/b$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Lb/m/a/b$a;->j(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method f()V
    .locals 3

    iget-object v0, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v0}, Lb/d/j;->l()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/m/a/b$c;->d:Lb/d/j;

    invoke-virtual {v2, v1}, Lb/d/j;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/m/a/b$a;

    invoke-virtual {v2}, Lb/m/a/b$a;->k()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
