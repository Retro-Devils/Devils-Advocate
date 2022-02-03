.class public final Lb/r/a/a/f$a;
.super Lb/r/a/a/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/r/a/a/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/r/a/a/a$a<",
        "Lb/r/a/a/f$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/r/a/a/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public h()Lb/r/a/a/f;
    .locals 1

    new-instance v0, Lb/r/a/a/f;

    invoke-direct {v0, p0}, Lb/r/a/a/f;-><init>(Lb/r/a/a/f$a;)V

    return-object v0
.end method

.method public i(J)Lb/r/a/a/f$a;
    .locals 1

    iget-object v0, p0, Lb/r/a/a/b$a;->a:Landroid/content/ContentValues;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "channel_id"

    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    return-object p0
.end method

.method public j(I)Lb/r/a/a/f$a;
    .locals 2

    iget-object v0, p0, Lb/r/a/a/b$a;->a:Landroid/content/ContentValues;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "weight"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object p0
.end method
