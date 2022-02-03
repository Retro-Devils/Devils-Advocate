.class public final Lb/r/a/a/f;
.super Lb/r/a/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/r/a/a/f$a;
    }
.end annotation


# static fields
.field public static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb/r/a/a/f;->a()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/r/a/a/f;->d:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lb/r/a/a/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/r/a/a/a;-><init>(Lb/r/a/a/a$a;)V

    return-void
.end method

.method private static a()[Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "channel_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "weight"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lb/r/a/a/a;->c:[Ljava/lang/String;

    new-array v3, v3, [[Ljava/lang/String;

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Lb/r/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/content/ContentValues;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb/r/a/a/f;->c(Z)Landroid/content/ContentValues;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Landroid/content/ContentValues;
    .locals 2

    invoke-super {p0, p1}, Lb/r/a/a/a;->c(Z)Landroid/content/ContentValues;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const-string v0, "channel_id"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lb/r/a/a/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lb/r/a/a/b;->b:Landroid/content/ContentValues;

    check-cast p1, Lb/r/a/a/f;

    iget-object p1, p1, Lb/r/a/a/b;->b:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PreviewProgram{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/r/a/a/b;->b:Landroid/content/ContentValues;

    invoke-virtual {v1}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
