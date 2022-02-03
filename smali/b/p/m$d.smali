.class Lb/p/m$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/p/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Ljava/lang/String;

.field c:Lb/p/s;

.field d:Lb/p/m0;

.field e:Lb/p/m;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/String;Lb/p/m;Lb/p/m0;Lb/p/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/p/m$d;->a:Landroid/view/View;

    iput-object p2, p0, Lb/p/m$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lb/p/m$d;->c:Lb/p/s;

    iput-object p4, p0, Lb/p/m$d;->d:Lb/p/m0;

    iput-object p3, p0, Lb/p/m$d;->e:Lb/p/m;

    return-void
.end method
