.class Lb/g/k/a0$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Lb/g/k/a0;


# direct methods
.method constructor <init>()V
    .locals 2

    new-instance v0, Lb/g/k/a0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/g/k/a0;-><init>(Lb/g/k/a0;)V

    invoke-direct {p0, v0}, Lb/g/k/a0$d;-><init>(Lb/g/k/a0;)V

    return-void
.end method

.method constructor <init>(Lb/g/k/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/g/k/a0$d;->a:Lb/g/k/a0;

    return-void
.end method


# virtual methods
.method a()Lb/g/k/a0;
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$d;->a:Lb/g/k/a0;

    return-object v0
.end method

.method b(Lb/g/d/b;)V
    .locals 0

    return-void
.end method

.method c(Lb/g/d/b;)V
    .locals 0

    return-void
.end method
