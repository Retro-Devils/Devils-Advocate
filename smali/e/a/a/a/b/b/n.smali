.class public Le/a/a/a/b/b/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Le/a/a/a/b/b/m;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le/a/a/a/b/b/m;Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/a/a/a/b/b/n;->a:Le/a/a/a/b/b/m;

    iput-object p2, p0, Le/a/a/a/b/b/n;->b:Ljava/lang/Object;

    if-eqz p2, :cond_1

    invoke-static {p1}, Le/a/a/a/b/b/g;->b(Le/a/a/a/b/b/m;)Le/a/a/a/b/b/f;

    move-result-object v0

    invoke-virtual {v0, p2}, Le/a/a/a/b/b/f;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " method doesn\'t support options of type "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
